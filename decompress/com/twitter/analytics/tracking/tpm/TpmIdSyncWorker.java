// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.analytics.tracking.tpm;

import java.util.Iterator;
import java.util.List;
import com.twitter.util.user.UserIdentifier;
import androidx.work.c;
import androidx.work.WorkerParameters;
import android.content.Context;
import androidx.work.RxWorker;

public class TpmIdSyncWorker extends RxWorker
{
    public TpmIdSyncWorker(final Context context, final WorkerParameters workerParameters) {
        super(context, workerParameters);
    }
    
    public final n9q<c.a> h() {
        final int d = out.d;
        final List a = rth.a(0);
        if (out.a()) {
            for (final UserIdentifier userIdentifier : kwe.b().d()) {
                if (userIdentifier.isRegularUser()) {
                    a.add(psc.c().b((ksc)new put(userIdentifier, new out(userIdentifier))).P());
                }
            }
        }
        return (n9q<c.a>)b5j.merge((Iterable)a).map((qtb)rut.D0).onErrorResumeNext((qtb)qut.D0).toList().w((qtb)sut.D0);
    }
}
