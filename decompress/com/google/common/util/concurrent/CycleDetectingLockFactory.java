// 
// Decompiled by Procyon v0.6.0
// 

package com.google.common.util.concurrent;

import java.util.ArrayList;
import java.util.logging.Logger;

public final class CycleDetectingLockFactory
{
    static {
        final gkg gkg = new gkg();
        final hkg$n$b d0 = hkg$n.D0;
        final hkg$n a = gkg.a;
        if (a == null) {
            gkg.a = (hkg$n)d0;
            final hkg$a l0 = hkg.L0;
            final hkg$n a2 = gkg.a();
            final hkg$n$a c0 = hkg$n.C0;
            if (a2 == c0 && gkg.b() == c0) {
                new hkg(gkg, (hkg$i)hkg$o$a.a);
            }
            else if (gkg.a() == c0 && gkg.b() == d0) {
                new hkg(gkg, (hkg$i)hkg$q$a.a);
            }
            else if (gkg.a() == d0 && gkg.b() == c0) {
                new hkg(gkg, (hkg$i)hkg$u$a.a);
            }
            else {
                if (gkg.a() != d0 || gkg.b() != d0) {
                    throw new AssertionError();
                }
                new hkg(gkg, (hkg$i)hkg$w$a.a);
            }
            Logger.getLogger(CycleDetectingLockFactory.class.getName());
            new ThreadLocal<ArrayList<c>>() {
                public final Object initialValue() {
                    wvz.i(3, "initialArraySize");
                    return new ArrayList(3);
                }
            };
            return;
        }
        throw new IllegalStateException(m0n.d0("Key strength was already set to %s", new Object[] { a }));
    }
    
    public static class b extends IllegalStateException
    {
        static {
            led.u(CycleDetectingLockFactory.class.getName(), b.class.getName(), c.class.getName());
        }
    }
    
    public static final class c
    {
    }
}
