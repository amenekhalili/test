package ir.fararayaneh.erp.data.models.online.request.socket;

import ir.fararayaneh.erp.data.models.online.request.RootModel;
import ir.fararayaneh.erp.data.models.tables.sync_tables.FuelListDetailTable;

public class FuelListDetailSocketModel extends RootModel implements ISocketModel {

    private FuelListDetailTable body;

    public FuelListDetailSocketModel(String kind, String organization, String userId, String appName, String hasFile, String lang, String pageNo, String pageItem, String chatRoomId, String nodeReceivedDate, String errorNumber, String receivers, FuelListDetailTable body) {
        super(kind, organization, userId, appName, hasFile, lang, pageNo, pageItem, chatRoomId, nodeReceivedDate, errorNumber, receivers);
        this.body=body;
    }

    public FuelListDetailTable getBody() {
        return body;
    }

    public void setBody(FuelListDetailTable body) {
        this.body = body;
    }
}

