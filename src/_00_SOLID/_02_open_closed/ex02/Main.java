package _00_SOLID._02_open_closed.ex02;

/** 문제해결
 * 새로운 포멧의 생성을 인터페이스로 행위 설정
 * 생성시 그냥 클래스만 추가하면 되므로 변경을 닫음
 */

public class Main {

    public static void main(String[] args) {
        Report pdfReport = new PDFReport();
        pdfReport.generate();

        Report htmlReport = new HTMLReport();
        htmlReport.generate();

        Report xmlReport = new XMLReport();
        xmlReport.generate();
    }

}
