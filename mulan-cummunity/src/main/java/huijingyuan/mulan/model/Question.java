package huijingyuan.mulan.model;

public class Question {
	private int id;
	private String title;
	private String content;
	private int user_id;
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Question(int id, String title, String content, int user_id) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.user_id = user_id;
	}
	@Override
	public String toString() {
		return "Question [id=" + id + ", title=" + title + ", content=" + content + ", user_id=" + user_id + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
}
