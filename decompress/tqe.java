import android.view.KeyEvent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tqe implements sqe
{
    public final stb<hqe, Boolean> a;
    
    public tqe(final stb<? super hqe, Boolean> a) {
        this.a = (stb<hqe, Boolean>)a;
    }
    
    public final int a(final KeyEvent keyEvent) {
        final boolean booleanValue = (boolean)this.a.invoke((Object)new hqe(keyEvent));
        int n = 1;
        boolean a = true;
        if (!booleanValue || !keyEvent.isShiftPressed()) {
            if (this.a.invoke((Object)new hqe(keyEvent))) {
                final long d = jty.d(keyEvent.getKeyCode());
                final glg a2 = glg.a;
                if (!ype.a(d, glg.c)) {
                    a = ype.a(d, glg.q);
                }
                if (a) {
                    n = 17;
                    return n;
                }
                if (!ype.a(d, glg.e)) {
                    if (ype.a(d, glg.f)) {
                        return 19;
                    }
                    if (ype.a(d, glg.b)) {
                        n = 26;
                        return n;
                    }
                    if (ype.a(d, glg.g)) {
                        n = 46;
                        return n;
                    }
                    return 0;
                }
            }
            else {
                if (keyEvent.isCtrlPressed()) {
                    return 0;
                }
                if (keyEvent.isShiftPressed()) {
                    final long d2 = jty.d(keyEvent.getKeyCode());
                    final glg a3 = glg.a;
                    if (ype.a(d2, glg.i)) {
                        n = 27;
                        return n;
                    }
                    if (ype.a(d2, glg.j)) {
                        n = 28;
                        return n;
                    }
                    if (ype.a(d2, glg.k)) {
                        n = 29;
                        return n;
                    }
                    if (ype.a(d2, glg.l)) {
                        n = 30;
                        return n;
                    }
                    if (ype.a(d2, glg.m)) {
                        n = 31;
                        return n;
                    }
                    if (ype.a(d2, glg.n)) {
                        n = 32;
                        return n;
                    }
                    if (ype.a(d2, glg.o)) {
                        n = 39;
                        return n;
                    }
                    if (ype.a(d2, glg.p)) {
                        n = 40;
                        return n;
                    }
                    if (!ype.a(d2, glg.q)) {
                        return 0;
                    }
                }
                else {
                    final long d3 = jty.d(keyEvent.getKeyCode());
                    final glg a4 = glg.a;
                    if (ype.a(d3, glg.i)) {
                        return n;
                    }
                    if (ype.a(d3, glg.j)) {
                        n = 2;
                        return n;
                    }
                    if (ype.a(d3, glg.k)) {
                        n = 11;
                        return n;
                    }
                    if (ype.a(d3, glg.l)) {
                        n = 12;
                        return n;
                    }
                    if (ype.a(d3, glg.m)) {
                        n = 13;
                        return n;
                    }
                    if (ype.a(d3, glg.n)) {
                        n = 14;
                        return n;
                    }
                    if (ype.a(d3, glg.o)) {
                        n = 7;
                        return n;
                    }
                    if (ype.a(d3, glg.p)) {
                        n = 8;
                        return n;
                    }
                    if (ype.a(d3, glg.r)) {
                        n = 44;
                        return n;
                    }
                    if (ype.a(d3, glg.s)) {
                        n = 20;
                        return n;
                    }
                    if (ype.a(d3, glg.t)) {
                        n = 21;
                        return n;
                    }
                    if (!ype.a(d3, glg.u)) {
                        if (ype.a(d3, glg.v)) {
                            return 19;
                        }
                        if (ype.a(d3, glg.w)) {
                            n = 45;
                            return n;
                        }
                        return 0;
                    }
                }
            }
            n = 18;
            return n;
            n = 19;
            return n;
        }
        final long d4 = jty.d(keyEvent.getKeyCode());
        final glg a5 = glg.a;
        if (ype.a(d4, glg.g)) {
            n = 47;
            return n;
        }
        n = 0;
        return n;
    }
}
