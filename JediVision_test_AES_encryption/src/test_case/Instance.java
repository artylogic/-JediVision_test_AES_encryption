package test_case;

import java.util.ArrayList;
import java.util.List;

public class Instance extends InstanceData {
    
    private String id;
    private String username;
    private String name;
    private long creationTime;
    private long lastChangeTime;
    private boolean isActive;
   

    public Instance() {
        super();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public List<ExchangeConfiguration> getAllUserAsUser() {
		List<ExchangeConfiguration> ExchangeConfiguration = new ArrayList<ExchangeConfiguration>();

		return ExchangeConfiguration;
	}
    }
    
    
