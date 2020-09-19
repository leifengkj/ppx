package com.akari.ppx.xp.hook.code.view;

import de.robv.android.xposed.XC_MethodHook;

import static de.robv.android.xposed.XposedHelpers.callMethod;

public class DetailButtonViewHook extends XC_MethodHook {
    @Override
    protected void afterHookedMethod(MethodHookParam param) throws Throwable {
        super.afterHookedMethod(param);
        callMethod(param.args[1], "setVisibility", 4);
    }
}
