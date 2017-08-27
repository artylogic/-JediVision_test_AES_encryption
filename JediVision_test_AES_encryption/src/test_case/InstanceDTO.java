package test_case;

import java.util.ArrayList;
import java.util.List;

public class InstanceDTO {
	// properties
	private String instanceId;
	private String name;
	private long creationTime;
	private long lastChangeTime;
	private boolean isActive;

	// getters and setters
	public String getInstanceId() {
		return instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(long creationTime) {
		this.creationTime = creationTime;
	}

	public long getLastChangeTime() {
		return lastChangeTime;
	}

	public void setLastChangeTime(long lastChangeTime) {
		this.lastChangeTime = lastChangeTime;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public List<ExchangeConfigurationDTO> getAllUserAsUserDTO() {
		List<ExchangeConfigurationDTO> ExchangeConfigurationDTO = new ArrayList<ExchangeConfigurationDTO>();

		return ExchangeConfigurationDTO;
	}

}
