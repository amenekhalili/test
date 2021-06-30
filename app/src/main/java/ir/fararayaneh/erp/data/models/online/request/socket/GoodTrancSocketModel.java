package ir.fararayaneh.erp.data.models.online.request.socket;

import ir.fararayaneh.erp.data.models.online.request.RootModel;
import ir.fararayaneh.erp.data.models.tables.sync_tables.GoodTranceTable;

public class GoodTrancSocketModel extends RootModel implements ISocketModel {

    private GoodTranceTable body;
    public GoodTrancSocketModel(String kind, String organization, String userId, String appName, String hasFile, String lang, String pageNo, String pageItem, String chatRoomId, String nodeReceivedDate, String errorNumber, String receivers,GoodTranceTable body) {
        super(kind, organization, userId, appName, hasFile, lang, pageNo, pageItem, chatRoomId, nodeReceivedDate, errorNumber, receivers);
        this.body=body;
    }

    public GoodTranceTable getBody() {
        return body;
    }

    public void setBody(GoodTranceTable body) {
        this.body = body;
    }
}