public class thing{
	private String prefix;
    public int times;
    private int rand;
    private String password;
    public thing(int amount,String x){
    	this.prefix = x;
        this.rand = amount;
        this.password = "";
    }
    public thing(int amount){
    	this.prefix = "A";
        this.rand = amount;
        this.password = "";
    }
    public int pwCount(){
    	return times;
    }
    public String pwGen(){
        password = "";
    	for(int i =0; i<rand;i++){
        	password = password+ ((int)(Math.random()*10));
            
        }
        password = prefix+"."+password;
        times++;
        return password;
  	}
      public static void main(String[]args){
        thing pass = new thing(12,"hi");
        System.out.println(pass.pwGen());
        System.out.println(pass.pwCount());
        System.out.println(pass.pwGen());
        System.out.println(pass.pwCount());
        System.out.println(pass.pwGen());
        System.out.println(pass.pwCount());
        thing pass2 = new thing(2,"wreqi");
        System.out.println(pass2.pwGen());
        System.out.println(pass2.pwCount());
      }
}
