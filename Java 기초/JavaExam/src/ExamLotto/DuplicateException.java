package ExamLotto;

public class DuplicateException extends Exception {

	DuplicateException()
	{
		super("중복된 로또 번호가 발생하였습니다.");
	}
}
