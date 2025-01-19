class Storage{
	boolean SSD;
	String storage;
	public Storage(boolean SSD, String storage){
		this.SSD = SSD;
		this.storage = storage;
	}
	public String toString(){
		if(this.SSD == true){
			return "Type: SSD Size:"+this.storage;
		}else{
			return "Type: HDD Size:"+this.storage;
		}
	}
}
class Computer{
	String name;
	Storage str;
	public Computer(String name, Storage str){
		this.name = name;
		this.str = str;
	}
	public String toString(){
		return "Name:"+this.name+" Storage: ("+this.str+")";
	}
}
class Composition{
	public static void main(String[] args){
		Storage s = new Storage(true,"256GB");
		Computer c = new Computer("HP",s);
		System.out.println(c);
	}
}