import android.database.ContentObserver;
import android.provider.Settings$Global;
import android.content.Context;
import android.net.Uri;
import android.content.ContentResolver;

// 
// Decompiled by Procyon v0.6.0
// 

@sa8(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1", f = "WindowRecomposer.android.kt", l = { 116, 122 }, m = "invokeSuspend")
public final class gqx extends p0s implements ftb<e7b<? super Float>, go6<? super fzv>, Object>
{
    public rp3 D0;
    public int E0;
    public Object F0;
    public final ContentResolver G0;
    public final Uri H0;
    public final hqx I0;
    public final yo3<fzv> J0;
    public final Context K0;
    
    public gqx(final ContentResolver g0, final Uri h0, final hqx i0, final yo3<fzv> j0, final Context k0, final go6<? super gqx> go6) {
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object f0, final go6<?> go6) {
        final gqx gqx = new gqx(this.G0, this.H0, this.I0, this.J0, this.K0, (go6<? super gqx>)go6);
        gqx.F0 = f0;
        return (go6<fzv>)gqx;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        return ((gqx)this.create(o, (go6<?>)o2)).invokeSuspend(fzv.a);
    }
    
    public final Object invokeSuspend(Object a) {
        Object d0 = dy6.D0;
        final int e0 = this.E0;
        Label_0088: {
            if (e0 == 0) {
                break Label_0088;
            }
            Label_0056: {
                if (e0 == 1) {
                    break Label_0056;
                }
                Label_0046: {
                    if (e0 != 2) {
                        break Label_0046;
                    }
                    Object o = this.D0;
                    Object d2 = this.F0;
                    try {
                        b1n.u(a);
                    Label_0186_Outer:
                        while (true) {
                            a = this;
                            while (true) {
                                try {
                                    ((gqx)a).F0 = d2;
                                    ((gqx)a).D0 = (rp3)o;
                                    ((gqx)a).E0 = 1;
                                    final Object a2 = ((rp3)o).a((go6)a);
                                    if (a2 == d0) {
                                        return d0;
                                    }
                                    final rp3 rp3 = (rp3)d2;
                                    d2 = o;
                                    o = rp3;
                                    final Object o2 = d0;
                                    d0 = a;
                                    try {
                                        if (a2) {
                                            ((rp3)d2).next();
                                            a = new Float(Settings$Global.getFloat(((gqx)d0).K0.getContentResolver(), "animator_duration_scale", 1.0f));
                                            ((gqx)d0).F0 = o;
                                            ((gqx)d0).D0 = (rp3)d2;
                                            ((gqx)d0).E0 = 2;
                                            a = ((e7b)o).a(a, (go6)d0);
                                            if (a == o2) {
                                                return o2;
                                            }
                                            a = d0;
                                            d0 = o2;
                                        }
                                    }
                                    finally {}
                                    ((gqx)d0).G0.unregisterContentObserver((ContentObserver)((gqx)d0).I0);
                                    return fzv.a;
                                }
                                finally {}
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                d2 = this.D0;
                                o = this.F0;
                                b1n.u(a);
                                final Object o2 = d0;
                                d0 = this;
                                final Object a2 = a;
                                continue;
                            }
                            b1n.u(a);
                            d2 = this.F0;
                            this.G0.registerContentObserver(this.H0, false, (ContentObserver)this.I0);
                            o = ((g3m)this.J0).iterator();
                            continue Label_0186_Outer;
                        }
                    }
                    finally {}
                }
            }
        }
        this.G0.unregisterContentObserver((ContentObserver)this.I0);
    }
}
