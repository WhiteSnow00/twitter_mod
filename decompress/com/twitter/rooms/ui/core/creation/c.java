// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.core.creation;

import com.twitter.weaver.mvi.MviViewModel;
import java.util.Set;
import android.content.Context;
import java.util.Objects;
import java.util.Arrays;

@sa8(c = "com.twitter.rooms.ui.core.creation.RoomCreationViewModel$intents$2$1", f = "RoomCreationViewModel.kt", l = {}, m = "invokeSuspend")
public final class c extends p0s implements ftb<fcn$b, go6<? super fzv>, Object>
{
    public Object D0;
    public final RoomCreationViewModel E0;
    
    public c(final RoomCreationViewModel e0, final go6<? super c> go6) {
        this.E0 = e0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object d0, final go6<?> go6) {
        final c c = new c(this.E0, (go6<? super c>)go6);
        c.D0 = d0;
        return (go6<fzv>)c;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final c c = (c)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        c.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final fcn$b fcn$b = (fcn$b)this.D0;
        final RoomCreationViewModel e0 = this.E0;
        final g7k p = e0.P0;
        final Context o2 = e0.O0;
        final String[] a = bi6.a;
        if (p.a(o2, (String[])Arrays.copyOf(a, a.length))) {
            final vjo t0 = this.E0.T0;
            final int a2 = fcn$b.a;
            Objects.requireNonNull(t0);
            boolean b = true;
            if (a2 != 0) {
                if (a2 != 1) {
                    if (a2 == 2) {
                        vjo.G(t0, "creation", "conversation_control", "everyone", "click", null, 48);
                    }
                }
                else {
                    vjo.G(t0, "creation", "conversation_control", "followed", "click", null, 48);
                }
            }
            else {
                vjo.G(t0, "creation", "conversation_control", "mentioned", "click", null, 48);
            }
            final RoomCreationViewModel e2 = this.E0;
            Objects.requireNonNull(e2);
            if (djo.J()) {
                Set e3 = e2.W0.e();
                if (e3.size() < 0) {
                    b = false;
                }
                if (!b) {
                    e3 = null;
                }
                if (e3 != null) {
                    ((MviViewModel)e2).x(rw0.c((oj)new et1((Object)e2, (Object)e3, 8)), (qsb)qcn.D0);
                }
            }
            final RoomCreationViewModel e4 = this.E0;
            ((MviViewModel)e4).T((qsb)new c$a(e4, fcn$b));
        }
        else {
            ((MviViewModel)this.E0).V((Object)dcn$c.a);
        }
        return fzv.a;
    }
}
