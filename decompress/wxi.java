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
import com.twitter.model.json.common.JsonModelRegistry$b;
import com.twitter.model.json.common.JsonModelRegistry$Registrar;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wxi implements JsonModelRegistry$Registrar
{
    public final void a(final JsonModelRegistry$b jsonModelRegistry$b) {
        final jpf h = jpf.h;
        final JsonModelRegistry$a jsonModelRegistry$a = (JsonModelRegistry$a)jsonModelRegistry$b;
        jsonModelRegistry$a.b((Class)onj.class, (Class)JsonOpenbackBatteryChargingStatus.class, (gra)h);
        jsonModelRegistry$a.b((Class)pnj.class, (Class)JsonOpenbackDate.class, (gra)bid.n);
        jsonModelRegistry$a.b((Class)qnj.class, (Class)JsonOpenbackDeviceDecisionsSignal.class, (gra)v2x.j);
        jsonModelRegistry$a.b((Class)rnj.class, (Class)JsonOpenbackExpiration.class, (gra)f2x.k);
        jsonModelRegistry$a.b((Class)snj.class, (Class)JsonOpenbackHeadphoneSignal.class, (gra)t2x.i);
        jsonModelRegistry$a.b((Class)tnj.class, (Class)JsonOpenbackLimits.class, (gra)zhd.h);
        jsonModelRegistry$a.b((Class)unj.class, (Class)JsonOpenbackMessage.class, (gra)e2x.i);
        jsonModelRegistry$a.b((Class)xnj.class, (Class)JsonOpenbackRingerVolumeSignal.class, (gra)z41.i);
        jsonModelRegistry$a.b((Class)ynj.class, (Class)JsonOpenbackSignals.class, (gra)xj4.l);
        jsonModelRegistry$a.b((Class)znj.class, (Class)JsonOpenbackUnlockSignal.class, (gra)u2x.i);
    }
}
