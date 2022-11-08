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
import com.twitter.model.json.common.JsonModelRegistry;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cxi implements Registrar
{
    @Override
    public final void a(final b b) {
        final k1x g = k1x.g;
        final JsonModelRegistry$a jsonModelRegistry$a = (JsonModelRegistry$a)b;
        jsonModelRegistry$a.b((Class)ai4$a.class, (Class)JsonAirplaneModeSignal.class, (bra)g);
        jsonModelRegistry$a.b((Class)ai4$b.class, (Class)JsonChargingSignal.class, (bra)y41.l);
        jsonModelRegistry$a.b((Class)ai4$c.class, (Class)JsonDoNotDisturbSignal.class, (bra)sj4.m);
        jsonModelRegistry$a.b((Class)ai4$d.class, (Class)JsonLightSensorSignal.class, (bra)u0x.k);
        jsonModelRegistry$a.b((Class)ai4$e.class, (Class)JsonOrientationSignal.class, (bra)apf.h);
        jsonModelRegistry$a.b((Class)ai4$f.class, (Class)JsonScreenRotationSignal.class, (bra)yhd.h);
        jsonModelRegistry$a.b((Class)ai4$g.class, (Class)JsonScreenUnlockedSignal.class, (bra)j1x.g);
        jsonModelRegistry$a.b((Class)ai4$h.class, (Class)JsonWifiSignal.class, (bra)i1x.f);
        jsonModelRegistry$a.b((Class)bi4.class, (Class)JsonClientSignalData.class, (bra)k1x.h);
        jsonModelRegistry$a.b((Class)ci4.class, (Class)JsonClientSignals.class, (bra)whd.g);
        jsonModelRegistry$a.b((Class)y9h.class, (Class)JsonMetricsDataWrapper.class, (bra)whd.f);
        jsonModelRegistry$a.b((Class)z9h.class, (Class)JsonMetricsDataWrapperList.class, (bra)t0x.i);
        jsonModelRegistry$a.c((Class)ayo.class, (TypeConverter)new mie());
        jsonModelRegistry$a.c((Class)q6q.class, (TypeConverter)new eje(1));
    }
}
