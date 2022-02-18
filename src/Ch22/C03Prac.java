package Ch22;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class BoardDTO{
	//속성
	//+subjetc:String
	String subject;
	//+content:String
	String content;
	//+writer:String
	String writer;
	
	//생성자
	//->모든 인자를 받는 생성자 사용
	BoardDTO(String subject,String content,String writer){
		this.subject=subject; this.content=content; this.writer=writer;
	}
	//기능
		//->toString을 재정의해서, 제목, 내용, 글쓴이를 출력
	@Override
	public String toString() {
		
		return "제목 : "+subject
				+" 내용 : "+content
				+" 글쓴이 : "+writer;
	}
	
		
}

public class C03Prac {

	public static void main(String[] args) {

		//ArrayList를 만들어서
		List<BoardDTO> list = new ArrayList();		
		//"Q"를 입력하기 전까지는 계속 제목/내용/글쓴이를 입력받아
		Scanner sc = new Scanner(System.in);
		String subject;
		String content;
		String writer;
		System.out.println("--순서는 제목, 내용, 글쓴이 입니다--");
		while(true) {
			System.out.println("입력[Q:종료] : ");
			subject=sc.nextLine();
			if(subject.equals("Q"))
				break;
			content=sc.nextLine();
			if(content.equals("Q"))
				break;
			writer=sc.nextLine();
			if(writer.equals("Q"))
				break;
			
			list.add(new BoardDTO(subject,content,writer));
		}
		//출력
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).toString());
		}
		
		//ArrayList에 추가합니다
		//"Q"를 입력하게 되면 입력을 멈추고 ArrayList에 있는 내용을 출력

	}

}
