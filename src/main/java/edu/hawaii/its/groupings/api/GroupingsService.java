package edu.hawaii.its.groupings.api;

import java.util.List;

import edu.hawaii.its.groupings.api.type.Group;
import edu.hawaii.its.groupings.api.type.Grouping;
import edu.hawaii.its.groupings.api.type.MyGroupings;
import edu.internet2.middleware.grouperClient.ws.beans.WsAddMemberResults;
import edu.internet2.middleware.grouperClient.ws.beans.WsAssignAttributesResults;
import edu.internet2.middleware.grouperClient.ws.beans.WsDeleteMemberResults;
import edu.internet2.middleware.grouperClient.ws.beans.WsGetAttributeAssignmentsResults;
import edu.internet2.middleware.grouperClient.ws.beans.WsGetGrouperPrivilegesLiteResult;
import edu.internet2.middleware.grouperClient.ws.beans.WsSubjectLookup;

public interface GroupingsService {

    public boolean hasListserv(String grouping);

    public List<Grouping> groupingsIn(String username);

    public boolean inGroup(String group, String username);

    //TODO change to non-Grouper return type
    public WsSubjectLookup makeWsSubjectLookup(String username);

    public boolean checkSelfOpted(String group, WsSubjectLookup lookup);

    //TODO change to non-Grouper return type
    public WsGetGrouperPrivilegesLiteResult grouperPrivilegesLite(String username, String privilegeName);

    //TODO change to non-Grouper return type
    public WsGetGrouperPrivilegesLiteResult grouperPrivilegesLite(String username, String privilegeName, String group);

    //TODO change to non-Grouper return type
    public WsAddMemberResults addMemberAs(String username, String group, String userToAdd);

    //TODO change to non-Grouper return type
    public WsDeleteMemberResults deleteMemberAs(String username, String group, String userToDelete);

    //TODO change to non-Object return type
    public Object[] assignOwnership(String grouping, String username, String newOwner);

    //TODO change to non-Object return type
    public Object[] removeOwnership(String grouping, String username, String ownerToRemove);

    public Grouping getGrouping(String grouping, String username);

    public MyGroupings getMyGroupings(String username);

    //TODO change to non-Object return type
    public Object[] optIn(String username, String grouping);

    //TODO change to non-Object return type
    public Object[] optOut(String username, String grouping);

    //TODO change to non-Object return type
    public Object[] cancelOptIn(String grouping, String username);

    //TODO change to non-Object return type
    public Object[] cancelOptOut(String grouping, String username);

    public String changeListServeStatus(String grouping, String username, boolean listServeOn);

    public String changeOptInStatus(String grouping, String username, boolean optInOn);

    public String changeOptOutStatus(String grouping, String username, boolean optOutOn);

    public Group findOwners(String grouping, String username);

    public boolean isOwner(String grouping, String username);

    public boolean groupOptInPermission(String username, String group);

    //TODO change to non-Grouper return type
    public WsAssignAttributesResults addSelfOpted(String group, String username);

    //TODO change to non-Grouper return type
    public WsAssignAttributesResults removeSelfOpted(String group, String username);

    public boolean groupOptOutPermission(String username, String group);

    //TODO change to non-Grouper return type
    public WsAssignAttributesResults updateLastModified(String group);

    //TODO change to non-Grouper return type
    public WsGetAttributeAssignmentsResults attributeAssignmentsResults(String assignType, String group, String nameName);

    public boolean optOutPermission(String grouping);

    public boolean optInPermission(String grouping);
}
