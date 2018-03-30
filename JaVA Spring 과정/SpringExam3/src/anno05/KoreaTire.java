package anno05;

import org.springframework.stereotype.Component;

@Component //koreaTire로 객체가 만들어진다.
public class KoreaTire implements Tire{

	@Override
	public String getBrand() {
		return "한국 타이어";
	}
}
