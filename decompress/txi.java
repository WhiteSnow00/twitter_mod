import com.bluelinelabs.logansquare.typeconverters.TypeConverter;
import com.twitter.ml.models.json.di.app.JsonMetricsDataWrapperList;
import com.twitter.ml.models.json.di.app.JsonMetricsDataWrapper;
import com.twitter.ml.models.json.di.app.JsonClientSignals;
import com.twitter.ml.models.json.di.app.JsonClientSignalData;
import com.twitter.ml.models.json.di.app.signals.JsonWifiSignal;
import com.twitter.ml.models.json.di.app.signals.JsonScreenUnlockedSignal;
import com.twitter.ml.models.json.di.app.signals.JsonScreenRotationSignal;
import com.twitter.ml.models.json.di.app.signals.JsonOrientationSignal;
import com.twitter.ml.models.json.di.app.signals.JsonLightSensorSignal;
import com.twitter.ml.models.json.di.app.signals.JsonDoNotDisturbSignal;
import com.twitter.ml.models.json.di.app.signals.JsonChargingSignal;
import com.twitter.ml.models.json.di.app.signals.JsonAirplaneModeSignal;
import com.twitter.model.json.common.JsonModelRegistry$a;
import com.twitter.model.json.common.JsonModelRegistry$b;
import com.twitter.model.json.common.JsonModelRegistry$Registrar;

// 
// Decompiled by Procyon v0.6.0
// 

public final class txi implements JsonModelRegistry$Registrar
{
    public final void a(final JsonModelRegistry$b jsonModelRegistry$b) {
        final xj4 j = xj4.j;
        final JsonModelRegistry$a jsonModelRegistry$a = (JsonModelRegistry$a)jsonModelRegistry$b;
        jsonModelRegistry$a.b((Class)gi4$a.class, (Class)JsonAirplaneModeSignal.class, (gra)j);
        jsonModelRegistry$a.b((Class)gi4$b.class, (Class)JsonChargingSignal.class, (gra)bid.m);
        jsonModelRegistry$a.b((Class)gi4$c.class, (Class)JsonDoNotDisturbSignal.class, (gra)v2x.i);
        jsonModelRegistry$a.b((Class)gi4$d.class, (Class)JsonLightSensorSignal.class, (gra)f2x.j);
        jsonModelRegistry$a.b((Class)gi4$e.class, (Class)JsonOrientationSignal.class, (gra)t2x.h);
        jsonModelRegistry$a.b((Class)gi4$f.class, (Class)JsonScreenRotationSignal.class, (gra)zhd.g);
        jsonModelRegistry$a.b((Class)gi4$g.class, (Class)JsonScreenUnlockedSignal.class, (gra)e2x.h);
        jsonModelRegistry$a.b((Class)gi4$h.class, (Class)JsonWifiSignal.class, (gra)z41.h);
        jsonModelRegistry$a.b((Class)hi4.class, (Class)JsonClientSignalData.class, (gra)xj4.k);
        jsonModelRegistry$a.b((Class)ii4.class, (Class)JsonClientSignals.class, (gra)u2x.h);
        jsonModelRegistry$a.b((Class)rah.class, (Class)JsonMetricsDataWrapper.class, (gra)u2x.g);
        jsonModelRegistry$a.b((Class)sah.class, (Class)JsonMetricsDataWrapperList.class, (gra)jpf.g);
        jsonModelRegistry$a.c((Class)lzo.class, (TypeConverter)new sie());
        jsonModelRegistry$a.c((Class)e8q.class, (TypeConverter)new lje(1));
    }
}
