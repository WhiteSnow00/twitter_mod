// 
// Decompiled by Procyon v0.6.0
// 

package com.airbnb.deeplinkdispatch;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Executor;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R$\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n" }, d2 = { "Lcom/airbnb/deeplinkdispatch/DeepLinkDispatch;", "", "()V", "validationExecutor", "Ljava/util/concurrent/Executor;", "getValidationExecutor$annotations", "getValidationExecutor", "()Ljava/util/concurrent/Executor;", "setValidationExecutor", "(Ljava/util/concurrent/Executor;)V", "deeplinkdispatch_release" }, k = 1, mv = { 1, 5, 1 }, xi = 48)
public final class DeepLinkDispatch
{
    public static final DeepLinkDispatch INSTANCE;
    private static Executor validationExecutor;
    
    static {
        INSTANCE = new DeepLinkDispatch();
        final ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        czd.e((Object)singleThreadExecutor, "newSingleThreadExecutor()");
        DeepLinkDispatch.validationExecutor = singleThreadExecutor;
    }
    
    private DeepLinkDispatch() {
    }
    
    public static final Executor getValidationExecutor() {
        return DeepLinkDispatch.validationExecutor;
    }
    
    public static void getValidationExecutor$annotations() {
    }
    
    public static final void setValidationExecutor(final Executor validationExecutor) {
        czd.f((Object)validationExecutor, "<set-?>");
        DeepLinkDispatch.validationExecutor = validationExecutor;
    }
}
