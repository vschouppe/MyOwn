package org.vs.resttraining.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.vs.resttraining.messenger.database.DatabaseClass;
import org.vs.resttraining.messenger.model.Profile;

public class ProfileService {

	private Map<String, Profile> profiles = DatabaseClass.getProfiles();

	public ProfileService() {
		profiles.put("Vincent", new Profile(1, "Vincent", "Schouppe",
				"Vincent"));

	}

	public List<Profile> getAllProfiles() {
		return new ArrayList(profiles.values());
	}

	public Profile getProfile(String profileName) {
		return this.profiles.get(profileName);
	}

	public Profile addProfile(Profile profile) {
		profile.setId(profiles.size() + 1); // id is amount of messages + 1
		return this.profiles.put(profile.getProfileName(), profile);
	}

	public Profile removeProfile(String profileName) {
		return this.profiles.remove(profileName);
	}

	public Profile updateProfile(Profile profile) {
		if (profile.getProfileName().isEmpty()) {
			return null;
		} else {
			return this.profiles.put(profile.getProfileName(), profile);
		}

	}

}
