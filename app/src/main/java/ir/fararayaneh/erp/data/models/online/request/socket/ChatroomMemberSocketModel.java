package ir.fararayaneh.erp.data.models.online.request.socket;

import ir.fararayaneh.erp.data.models.online.request.RootModel;
import ir.fararayaneh.erp.data.models.tables.sync_tables.ChatroomMemberTable;

public class ChatroomMemberSocketModel extends RootModel implements ISocketModel {

    private ChatroomMemberTable body;

    public ChatroomMemberSocketModel(String kind, String organization, String userId, String appName, String hasFile, String lang, String pageNo, String pageItem, String chatRoomId, String nodeReceivedDate, String errorNumber, String receivers, ChatroomMemberTable body) {
        super(kind, organization, userId, appName, hasFile, lang, pageNo, pageItem, chatRoomId, nodeReceivedDate, errorNumber, receivers);
        this.body=body;
    }

    public ChatroomMemberTable getBody() {
        return body;
    }

    public void setBody(ChatroomMemberTable body) {
        this.body = body;
    }
}
