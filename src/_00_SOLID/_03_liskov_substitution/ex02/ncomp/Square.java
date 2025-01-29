package _00_SOLID._03_liskov_substitution.ex02.ncomp;



/** 문제
 * 정사각형의 특징으로 모든 변
 * 부모의 넓이 구하는 메소드를 가지지 못한다
 * 대체 하지 못하는 문제 발생
 */
public class Square extends Rectangle{

    @Override
    public void setWidth(int width) {
        this.width = width;
        this.height = width;
    }

    @Override
    public void setHeight(int height) {
        this.width = height;
        this.height = height;
    }
}
