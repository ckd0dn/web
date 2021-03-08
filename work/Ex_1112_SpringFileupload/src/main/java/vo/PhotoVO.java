package vo;

import org.springframework.web.multipart.MultipartFile;

public class PhotoVO {

	//제목:<input name="title">
	//사진:<input type="file" name="photo">
	//insert_form.jsp에서 넘기고자 하는 name과 반드시 같은 이름으로 변수명을 지정해야 한다
	private String title;
	private MultipartFile photo;
	private String filename;//업로드 된 파일명을 저장할 변수
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public MultipartFile getPhoto() {
		return photo;
	}
	public void setPhoto(MultipartFile photo) {
		this.photo = photo;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}

}










