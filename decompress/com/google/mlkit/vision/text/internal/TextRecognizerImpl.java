// 
// Decompiled by Procyon v0.6.0
// 

package com.google.mlkit.vision.text.internal;

import java.util.concurrent.Callable;
import com.google.mlkit.common.MlKitException;
import androidx.annotation.RecentlyNonNull;
import java.util.concurrent.Executor;
import com.google.mlkit.vision.common.internal.MobileVisionBase;

public class TextRecognizerImpl extends MobileVisionBase<pds> implements nis
{
    public TextRecognizerImpl(final qis qis, final Executor executor, final jnz jnz, final pis pis) {
        super((cfg)qis, executor);
        final fgz fgz = new fgz();
        yfz c;
        if (((ois)pis).b()) {
            c = yfz.E0;
        }
        else {
            c = yfz.D0;
        }
        fgz.c = c;
        final ezz ezz = new ezz();
        final yrb yrb = new yrb(5);
        yrb.C0 = m0n.S0(1);
        ezz.E0 = new zkz(yrb);
        fgz.d = new rkz(ezz);
        jnz.b(new qnz(fgz, 1), cgz.E0, jnz.c());
    }
    
    public final zas<pds> D0(@RecentlyNonNull final srd srd) {
        synchronized (this) {
            zas zas;
            if (super.C0.get()) {
                zas = zbs.d((Exception)new MlKitException("This detector is already closed!", 14));
                monitorexit(this);
            }
            else if (srd.b >= 32 && srd.c >= 32) {
                zas = ((lih)super.D0).a(super.F0, (Callable)new gsy(this, srd), (phy)super.E0.C0);
                monitorexit(this);
            }
            else {
                zas = zbs.d((Exception)new MlKitException("InputImage width and height should be at least 32!", 3));
            }
            return (zas<pds>)zas;
        }
    }
}
