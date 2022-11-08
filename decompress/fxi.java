import com.twitter.notifications.openback.json.JsonOpenbackUnlockSignal;
import com.twitter.notifications.openback.json.JsonOpenbackSignals;
import com.twitter.notifications.openback.json.JsonOpenbackRingerVolumeSignal;
import com.twitter.notifications.openback.json.JsonOpenbackMessage;
import com.twitter.notifications.openback.json.JsonOpenbackLimits;
import com.twitter.notifications.openback.json.JsonOpenbackHeadphoneSignal;
import com.twitter.notifications.openback.json.JsonOpenbackExpiration;
import com.twitter.notifications.openback.json.JsonOpenbackDeviceDecisionsSignal;
import com.twitter.notifications.openback.json.JsonOpenbackDate;
import com.twitter.notifications.openback.json.JsonOpenbackBatteryChargingStatus;
import com.twitter.model.json.common.JsonModelRegistry$a;
import com.twitter.model.json.common.JsonModelRegistry;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fxi implements Registrar
{
    @Override
    public final void a(final b b) {
        final t0x j = t0x.j;
        final JsonModelRegistry$a jsonModelRegistry$a = (JsonModelRegistry$a)b;
        jsonModelRegistry$a.b((Class)tmj.class, (Class)JsonOpenbackBatteryChargingStatus.class, (bra)j);
        jsonModelRegistry$a.b((Class)umj.class, (Class)JsonOpenbackDate.class, (bra)y41.m);
        jsonModelRegistry$a.b((Class)vmj.class, (Class)JsonOpenbackDeviceDecisionsSignal.class, (bra)sj4.n);
        jsonModelRegistry$a.b((Class)wmj.class, (Class)JsonOpenbackExpiration.class, (bra)u0x.l);
        jsonModelRegistry$a.b((Class)xmj.class, (Class)JsonOpenbackHeadphoneSignal.class, (bra)apf.i);
        jsonModelRegistry$a.b((Class)ymj.class, (Class)JsonOpenbackLimits.class, (bra)yhd.i);
        jsonModelRegistry$a.b((Class)zmj.class, (Class)JsonOpenbackMessage.class, (bra)j1x.h);
        jsonModelRegistry$a.b((Class)cnj.class, (Class)JsonOpenbackRingerVolumeSignal.class, (bra)i1x.g);
        jsonModelRegistry$a.b((Class)dnj.class, (Class)JsonOpenbackSignals.class, (bra)k1x.i);
        jsonModelRegistry$a.b((Class)enj.class, (Class)JsonOpenbackUnlockSignal.class, (bra)whd.h);
    }
}
