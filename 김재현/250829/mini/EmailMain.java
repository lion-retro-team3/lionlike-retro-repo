package mini;

import mini.email.Email;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class EmailMain {

    static Scanner input = new Scanner(System.in);
    static Map<String, Member> members = new HashMap<>();
    static String loginMember;

    // main 메서드 시작할 때 test 데이터 자동 추가
    private static void init() {
        String email1 = "test1@lion.com";
        String email2 = "test2@lion.com";
        String name1 = "재현";
        String name2 = "멋사";

        members.put(email1, new Member(email1, name1));
        members.put(email2, new Member(email2, name2));
        Member member1 = members.get(email1);
        Member member2 = members.get(email2);
        member1.receive("test2@lion.com", "Test Title1", "test content1111/test content1111".split("/"));
        member2.receive("test1@lion.com", "Test Title2", "test content2222/test content2222".split("/"));
    }

    public static void main(String[] args) {
        init();
        while (true) {
            System.out.println("----------------- 이메일 시스템 -----------------");
            System.out.print("옵션 선택(1. 회원등록 2. 로그인 3. 전체 회원 조회 ex. 종료): ");
            String option = input.nextLine();

            switch (option) {
                case "1":
                    System.out.println("------------------- 회원가입 -------------------");
                    System.out.print("이메일을 입력하세요: ");
                    String email = input.nextLine();
                    if (members.get(email) != null) {
                        System.out.println("[오류] 중복되는 이메일이 존재합니다.");
                        break;
                    }
                    System.out.print("이름을 입력하세요: ");
                    String name = input.nextLine();
                    members.put(email, new Member(email, name));
                    System.out.println("[회원가입 완료]");
                    break;
                case "2":
                    System.out.println("-------------------- 로그인 --------------------");
                    System.out.print("이메일을 입력하세요: ");
                    String login = input.nextLine();
                    if (members.get(login) == null) {
                        System.out.println("[오류] 입력하신 이메일의 가입정보가 존재하지 않습니다.");
                        break;
                    }
                    loginMember = login;
                    System.out.println(members.get(loginMember).getName() + "님 환영합니다!");

                    // 로그인 후 기능
                    userFunction();
                    break;
                case "3":
                    System.out.println("------------------ 회원 리스트 ------------------");
                    for (Member value : members.values()) {
                        System.out.println("- " + value);
                    }
                    break;
                case "ex":
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("[오류] 옵션을 잘못 입력했습니다.");
            }
        }
    }

    private static void userFunction() {
        while (true) {
            System.out.print("옵션 선택(1. 메일 쓰기 2. 메일함 3. 메일 삭제 4. 로그아웃): ");
            String userOption = input.nextLine();
            switch (userOption) {
                case "1":
                    // 이메일 보내기
                    System.out.println("------------------- 메일쓰기 -------------------");
                    System.out.print("받는 사람: ");
                    String to = input.nextLine();
                    if (members.get(to) == null) {
                        System.out.println("[오류] 입력하신 이메일의 가입정보가 존재하지 않습니다.");
                        break;
                    }
                    System.out.print("제목: ");
                    String title = input.nextLine();
                    System.out.print("내용(줄바꿈은[/]로): ");
                    String[] content = input.nextLine().split("/");

                    Member sendMember = members.get(to);
                    sendMember.receive(loginMember, title, content);
                    System.out.println("메일이 전송되었습니다.");

                    break;
                case "2":
                    List<Email> mailBox = showMails();
                    System.out.print("읽을 메일 번호를 입력해주세요(나가기: 0): ");
                    int mailId = inputMailId();
                    if (mailId == 0) {
                        break;
                    }
                    Email selectMail = mailBox.get(mailId - 1);
                    selectMail.setRead(true);
                    System.out.println("-----------------------------------------------");
                    System.out.println("["+selectMail.getTitle()+"]");
                    System.out.println("보낸사람: " + selectMail.getFrom());
                    System.out.println("받는사람: " + selectMail.getTo());
                    String[] contentDetail = selectMail.getContent();
                    for (String s : contentDetail) {
                        System.out.println("| " + s);
                    }
                    System.out.println("-----------------------------------------------");
                    break;
                case "3":
                    List<Email> deleteList = showMails();
                    System.out.print("삭제할 메일 번호를 입력해주세요(나가기: 0): ");
                    int deleteId = inputMailId();
                    if (deleteId == 0) {
                        break;
                    }
                    if (!deleteList.get(deleteId - 1).isRead()) {
                        System.out.print("[경고] 아직 메일을 읽지 않았습니다. 삭제하시겠습니까? (Y/N): ");
                        if (input.nextLine().equals("N")) {
                            break;
                        }
                    }
                    deleteList.remove(deleteId - 1);
                    System.out.println("[메일이 삭제되었습니다.]");
                    break;
                case "4":
                    // 로그아웃
                    return;
                default:
                    System.out.println("[오류] 옵션을 잘못 입력하셨습니다.");
            }
        }
    }

    private static int inputMailId() {
        int num = input.nextInt();
        input.nextLine(); // nextInt 는 enter 를 읽지 않기 때문에 여기서 처리해야한다.
        return num;
    }

    private static List<Email> showMails() {
        System.out.println("-------------------- 메일함 --------------------");
        Member member = members.get(loginMember);
        List<Email> mailBox = member.getMailBox();
        // 메일 번호 부여를 위해 일반 for 문으로 순회
        System.out.printf("|%-4s |%-25s |%-20s |%-8s |%-10s\n",
                "No", "Title", "From", "isRead", "Date");
        for (int i = 0; i < mailBox.size(); i++) {
            Email myEmail = mailBox.get(i);
            String isRead = myEmail.isRead() ? "O" : "X";
            System.out.printf("|%-4d |%-25s |%-20s |%-8s |%-10s\n",
                    i + 1, myEmail.getTitle(), myEmail.getFrom(), isRead, myEmail.getSentAt());
        }
        System.out.println("-----------------------------------------------");
        return mailBox;
    }
}
