package cn.bravedawn.latte.delegates;

/**
 * Created by 冯晓 on 2017/9/15.
 */

public abstract class LatteDelegate extends PermissionCheckerDelegate{

    @SuppressWarnings("unused")
    public <T extends LatteDelegate> T getParentDelegate(){
        return (T) getParentFragment();
    }
}
