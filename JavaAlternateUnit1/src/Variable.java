
public class Variable {
	

	        //Fields
			String name;
			String type;

			//Constructor
			public Variable(String name, String type) {
				super();
				this.name = name;
				this.type = type;
			}

			//Variable bit size
			public int getBits() {

				if (type.equals("int")) {
					return 32;
				} else if (type.equals("short")) {
					return 16;
				} else if (type.equals("boolean")) {
					return 1;
				} else if (type.equals("long")) {
					return 64;
				} else if (type.equals("float")) {
					return 32;
				} else if (type.equals("double")) {
					return 64;
				} else if (type.equals("byte")) {
					return 1;
				} else if (type.equals("char")) {
					return 16;
				}

				return 0;
			}
			
			// Setters
		    public void setName(String name) {
		        this.name = name;
		    }

		    public void setType(String type) {
		        this.type = type;
		    }

		    // Getters
		    public String getName() {
		        return this.name;
		    } 

		    public String getType() {
		        return this.type;
		    }
}
