package bean;

public class User {
	private int id ; 
	private String name ;
	private String password ;
	private String question ;
	private String answer ;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(String name, String password, String question, String answer) {
		super();
		this.name = name;
		this.password = password;
		this.question = question;
		this.answer = answer;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		
			this.password = password;
		
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
}
