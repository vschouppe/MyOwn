package org.vs.resttraining.messenger.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.vs.resttraining.messenger.model.Profile;
import org.vs.resttraining.messenger.service.ProfileService;




@Path("/profiles")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ProfileResource {
	
	ProfileService ps = new ProfileService();

	@GET
	public List<Profile> getProfiles() {
		return this.ps.getAllProfiles();
	}

	@POST
	public Profile addProfile(Profile Profile) {
		return this.ps.addProfile(Profile);
	}

	@GET
	@Path("/{profileName}")
	public Profile getProfile(@PathParam("profileName") String profileName) {
		return this.ps.getProfile(profileName);
	}

	@PUT
	@Path("/{profileName}")
	public Profile updateProfile(@PathParam("profileName") String profileName, Profile profile){
		profile.setProfileName(profileName);
		return this.ps.updateProfile(profile);
	}

	@DELETE
	@Path("/{profileName}")
	public Profile removeProfile(@PathParam("profileName") String profileName) {
		return this.ps.removeProfile(profileName);
	}
}
