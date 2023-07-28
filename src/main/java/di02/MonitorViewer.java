package di02;
public class MonitorViewer implements Viewer{
	
	private DisplayMode displayMode;   //DI를 해야한다
	@Override
	public void draw() {		
		System.out.println(displayMode.getType() 
				+" 모드로 카메라 이미지 출력됨");
		
	}
	
	//setter injection
	public void setDisplayMode(DisplayMode displayMode) {
		this.displayMode = displayMode;
	}
}