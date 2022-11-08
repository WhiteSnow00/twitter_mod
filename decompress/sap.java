import android.os.Bundle;
import android.content.Intent;
import com.twitter.android.onboarding.core.invisiblesubtask.SecurityKeyEnrollmentSubtaskHandler;
import android.app.PendingIntent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class sap extends gue implements rtb<PendingIntent, oyv>
{
    public final /* synthetic */ SecurityKeyEnrollmentSubtaskHandler C0;
    
    public sap(final SecurityKeyEnrollmentSubtaskHandler c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final PendingIntent pendingIntent = (PendingIntent)o;
        final SecurityKeyEnrollmentSubtaskHandler c0 = this.C0;
        c0.e = true;
        c0.a.startIntentSenderForResult(pendingIntent.getIntentSender(), 1001, (Intent)null, 0, 0, 0, (Bundle)null);
        return oyv.a;
    }
}
