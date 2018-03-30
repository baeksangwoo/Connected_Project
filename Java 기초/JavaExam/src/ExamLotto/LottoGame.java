package ExamLotto;

public class LottoGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			LottoMachine a = new LottoMachine();

			a.createLottoNums();
			a.checkLottoNums();

			for (int d = 0; d < 6; d++) {
				System.out.println(a.getNums()[d]);
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
