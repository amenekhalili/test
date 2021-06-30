package ir.fararayaneh.erp.adaptors.combo_form_adaptor;

import androidx.appcompat.widget.AppCompatTextView;
import android.view.View;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import ir.fararayaneh.erp.IBase.Ibase_recycle_view_holder.BaseRecHolder;
import ir.fararayaneh.erp.R;
import ir.fararayaneh.erp.commons.Commons;

public class ComboFormRecHolderType3 extends BaseRecHolder {

    private IClickRowComboFormRecHolderListener holderListener;
    @BindView(R.id.txt_title_row_form_type_3)
    AppCompatTextView txt_title_row_form_type_3;
    @BindView(R.id.txt_value_row_form_type_3)
    AppCompatTextView txt_value_row_form_type_3;
    @BindView(R.id.txt_error_row_form_type_3)
    AppCompatTextView txt_error_row_form_type_3;

    @OnClick({R.id.txt_title_row_form_type_3, R.id.txt_value_row_form_type_3, R.id.txt_error_row_form_type_3})
    public void clickComboFormRecHolderType3(View view) {
        if(holderListener!=null){
            holderListener.clickRow(getAdapterPosition(),"");
        }
    }

    ComboFormRecHolderType3(View itemView, IClickRowComboFormRecHolderListener holderListener) {
        super(itemView);
        this.holderListener=holderListener;
    }

    @Override
    protected void inflateButterKnife(View itemView) {
        ButterKnife.bind(this, itemView);
    }

    void setRowData(String title , String value ,String error) {


        showHideTitle(!title.equals(Commons.NULL));
        showHideValue(!value.equals(Commons.NULL));
        showHideError(!error.equals(Commons.NULL));
        txt_title_row_form_type_3.setText(title);
        txt_value_row_form_type_3.setText(value);
        txt_error_row_form_type_3.setText(error);
    }

    private void showHideTitle(boolean showHide) {
        txt_title_row_form_type_3.setVisibility(showHide?View.VISIBLE:View.GONE);
    }


    private void showHideValue(boolean showHide) {
        txt_value_row_form_type_3.setVisibility(showHide?View.VISIBLE:View.GONE);
    }

    private void showHideError(boolean showHide) {
        txt_error_row_form_type_3.setVisibility(showHide?View.VISIBLE:View.GONE);
    }


}

