package cn.bravedawn.latte.wechat;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;

/**
 * Created by 冯晓 on 2017/9/29.
 */

public abstract class BaseWXPayEntryActivity extends BaseWXActivity{

    private static final int WX_PAY_SUCCESS = 0;
    private static final int WX_PAY_FAIL = -1;
    private static final int WX_PAY_CANCEL = -2;

    protected abstract void onPaySuccess();

    protected abstract void onPayFail();

    protected abstract void onPayCancel();


    @Override
    public void onResp(BaseResp baseResp) {
        if (baseResp.getType() == ConstantsAPI.COMMAND_PAY_BY_WX){
            switch (baseResp.errCode){
                case WX_PAY_SUCCESS:
                    onPaySuccess();
                    break;
                case WX_PAY_FAIL:
                    onPayFail();
                    break;
                case WX_PAY_CANCEL:
                    onPayFail();
                    break;
                default:
                    break;
            }
        }
    }
}
