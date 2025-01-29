package _00_SOLID._03_liskov_substitution.ex01.ncomp;

/**문제점
 * 펭귄 클래스는 새클래스의 모든 역할을 수행하지 못한다
 * lsp 위반이 발생
 */
public class Penguin extends Bird{

    @Override
    public void fly() {
        //펭귄은 날지 못한다...ㅠㅠ
        throw new UnsupportedOperationException("Penguins can't fly");
    }
}
