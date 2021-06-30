package ir.fararayaneh.erp.data.data_providers.queries.time_queris;

import android.util.Log;

import io.reactivex.Single;
import ir.fararayaneh.erp.App;
import ir.fararayaneh.erp.data.data_providers.queries.BaseQueries;
import ir.fararayaneh.erp.data.models.IModels;
import ir.fararayaneh.erp.data.models.tables.sync_tables.TimeTable;
import ir.fararayaneh.erp.utils.database_handler.RealmCloseHelper;


//todo eslahe hame queri haye class service va hazfe anha be samte queri haye asli
public class InsertUpdateTimeTableServiceQuery extends BaseQueries {

    @Override
    public Single<IModels> data(IModels iModels) {
        super.data(iModels);

        TimeTable timeTable = (TimeTable) iModels;

        return Single.create(emitter -> {
            realm.beginTransaction();
            realm.insertOrUpdate(timeTable);
            realm.commitTransaction();
            Log.i("arash", "InsertUpdateTimeTableServiceQuery: " + realm.where(TimeTable.class).findAll().size());
            if (!emitter.isDisposed()) {
                emitter.onSuccess(App.getNullRXModel());
            }
            RealmCloseHelper.closeRealm(realm);
        });
    }
}
