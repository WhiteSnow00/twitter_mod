// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.onboarding.ocf.sso;

import kotlin.Metadata;
import com.twitter.onboarding.ocf.NavigationHandler;

public final class SsoSubtaskPresenter
{
    public final fci<?> a;
    public final o6r b;
    public final NavigationHandler c;
    public final r9a d;
    public final mxe<p6c> e;
    
    public SsoSubtaskPresenter(final fci<?> a, final o6r b, final NavigationHandler c, final r9a d, final mxe<p6c> e) {
        e0e.f((Object)a, "navigator");
        e0e.f((Object)b, "subtask");
        e0e.f((Object)c, "navigationHandler");
        e0e.f((Object)d, "errorReporter");
        e0e.f((Object)e, "googleSsoClient");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        final i6r j = b.j;
        if (SsoSubtaskPresenter.d.a[((Enum)j).ordinal()] == 1) {
            ((p6c)e.get()).b((stb<? super q6c, vzv>)new SsoSubtaskPresenter$a((Object)this), (stb<? super Exception, vzv>)new SsoSubtaskPresenter$b((Object)this), (ptb<vzv>)new SsoSubtaskPresenter$c((Object)this));
        }
        else {
            final StringBuilder sb = new StringBuilder();
            sb.append("Provider not yet supported: ");
            sb.append(j);
            d.f((Throwable)new UnsupportedSsoProviderException(sb.toString()));
            c.e(b.p);
        }
    }
    
    @Metadata(bv = {}, d1 = { "\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003" }, d2 = { "Lcom/twitter/onboarding/ocf/sso/SsoSubtaskPresenter$UnsupportedSsoProviderException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "subsystem.tfa.ocf.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class UnsupportedSsoProviderException extends IllegalStateException
    {
        public UnsupportedSsoProviderException(final String s) {
            e0e.f((Object)s, "message");
            super(s);
        }
    }
    
    public final class d
    {
        public static final int[] a;
        
        static {
            final int[] a2 = new int[i6r.values().length];
            while (true) {
                try {
                    final i6r i0 = i6r.I0;
                    a2[1] = 1;
                    a = a2;
                }
                catch (final NoSuchFieldError noSuchFieldError) {
                    continue;
                }
                break;
            }
        }
    }
}
