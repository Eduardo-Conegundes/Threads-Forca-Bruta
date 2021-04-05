public class SenhaForcaBruta extends Thread {

	private long min;
	private long max;
	private long password;
	private int id;
	private String passowrdStr;
	private int sleep;

	public SenhaForcaBruta(String password, int id) {
		switch(id) {
		case 0:
			this.min = 0000000000;
			this.max = 1111111111L;
			break;

		case 1:
			this.min = 1111111111L;
			this.max = 2222222222L;
			this.sleep = 1000;
			break;

		case 2:
			this.min = 2222222222L;
			this.max = 3333333333L;
			this.sleep = 2000;
			break;

		case 3:
			this.min = 3333333333L;
			this.max = 4444444444L;
			this.sleep = 3000;
			break;

		case 4:
			this.min = 4444444444L;
			this.max = 5555555555L;
			this.sleep = 4000;
			break;

		case 5:
			this.min = 5555555555L;
			this.max = 6666666666L;
			this.sleep = 5000;
			break;

		case 6:
			this.min = 6666666666L;
			this.max = 7777777777L;
			this.sleep = 6000;
			break;

		case 7: 
			this.min = 7777777777L;
			this.max = 8888888888L;
			this.sleep = 7000;
			break;

		case 8:
			this.min = 8888888888L;
			this.max = 9999999999L;
			this.sleep = 8000;
			break;
		}

		this.password = Long.parseLong(password);
		this.passowrdStr = password;
		this.id = id;
	}

	public void SenhaEncontrada() {
		System.out.println("Senha encontrada: " + this.passowrdStr + " pela thread " + this.id);
		System.exit(0);
	}

	public void run() {
		try {
			sleep(this.sleep);
			System.out.println("Executando thread " + this.id);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		for (long i = this.min; i < this.max; i++) {
			if (i == this.password) {
				SenhaEncontrada();
			}
		}
	}
}
