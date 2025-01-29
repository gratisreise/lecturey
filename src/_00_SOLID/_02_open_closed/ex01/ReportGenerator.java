package _00_SOLID._02_open_closed.ex01;

public class ReportGenerator {

    /**문제점
     * 새로운 포멧 추가시 메서드 수정해야한다.
     * 그럼에도 불가하고 추가하면 => 무한정 메소드가 복잡해진다.
     */
    public void generateReport(String type){
        if(type.equals("PDF")){
            System.out.println("Generating PDF report...");
        } else if(type.equals("HTML")){
            System.out.println("Generating HTML report...");
        }
        // 먄약 다른 포맷의 추가사항이 생기면 이 메서드를 수정해야한다
    }

}
