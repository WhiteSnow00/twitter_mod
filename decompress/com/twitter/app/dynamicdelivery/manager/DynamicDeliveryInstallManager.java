// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.dynamicdelivery.manager;

import kotlin.Metadata;
import android.app.Activity;
import java.util.Locale;

public interface DynamicDeliveryInstallManager
{
    public static final a Companion = a.a;
    
    void a(final Locale p0);
    
    void b(final String p0);
    
    void c(final String p0);
    
    void d(final Activity p0, final yn9$g p1);
    
    void e();
    
    h5j<yn9> f(final String p0);
    
    void g(final Locale p0);
    
    void h(final Locale p0);
    
    @Metadata(bv = {}, d1 = { "\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003" }, d2 = { "Lcom/twitter/app/dynamicdelivery/manager/DynamicDeliveryInstallManager$DynamicDeliveryException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "lib.core.app.dynamic-delivery.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class DynamicDeliveryException extends Exception
    {
        public final int D0;
        
        public DynamicDeliveryException(final int d0) {
            this.D0 = d0;
        }
    }
    
    public static final class a
    {
        public static final a a;
        
        static {
            a = new a();
        }
    }
}
