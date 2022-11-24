import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.twitter.commerce.json.merchantconfiguration.JsonCommerceConfigRequestInput;
import com.twitter.ml.models.json.di.app.JsonMetricsDataWrapperList;
import java.util.Objects;
import com.twitter.notifications.openback.json.JsonOpenbackBatteryChargingStatus;
import com.twitter.professional.json.business.JsonAboutModuleConfigInputSimplifiedInput;
import com.twitter.professional.json.business.JsonBusinessOpenTimesRegularSlotInput;
import com.twitter.model.json.search.JsonSearchSettings;
import android.view.View;
import android.content.Context;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jpf implements gra
{
    public static final jpf b;
    public static final jpf c;
    public static final jpf d;
    public static final jpf e;
    public static final jpf f;
    public static final jpf g;
    public static final jpf h;
    public static final jpf i;
    public static final jpf j;
    public static final jpf k;
    public static final jpf l;
    public static final jpf m;
    public final int a;
    
    static {
        b = new jpf(0);
        c = new jpf(1);
        d = new jpf(2);
        e = new jpf(3);
        f = new jpf(4);
        g = new jpf(5);
        h = new jpf(6);
        i = new jpf(7);
        j = new jpf(8);
        k = new jpf(9);
        l = new jpf(10);
        m = new jpf(11);
    }
    
    public jpf(final int a) {
        this.a = a;
    }
    
    public final Object a(final Object o) {
        switch (this.a) {
            default: {
                return new daq((Context)o);
            }
            case 10: {
                final View view = (View)o;
                final int a = o5j.a;
                return view;
            }
            case 9: {
                final s8p s8p = (s8p)o;
                final JsonSearchSettings jsonSearchSettings = new JsonSearchSettings();
                jsonSearchSettings.a = s8p.a;
                jsonSearchSettings.b = s8p.b;
                return jsonSearchSettings;
            }
            case 8: {
                final r23 r23 = (r23)o;
                final JsonBusinessOpenTimesRegularSlotInput jsonBusinessOpenTimesRegularSlotInput = new JsonBusinessOpenTimesRegularSlotInput();
                jsonBusinessOpenTimesRegularSlotInput.a = r23.a;
                jsonBusinessOpenTimesRegularSlotInput.b = r23.b;
                return jsonBusinessOpenTimesRegularSlotInput;
            }
            case 7: {
                final i7 i7 = (i7)o;
                final JsonAboutModuleConfigInputSimplifiedInput jsonAboutModuleConfigInputSimplifiedInput = new JsonAboutModuleConfigInputSimplifiedInput();
                jsonAboutModuleConfigInputSimplifiedInput.a = i7.b;
                jsonAboutModuleConfigInputSimplifiedInput.b = i7.a;
                jsonAboutModuleConfigInputSimplifiedInput.c = i7.c;
                return jsonAboutModuleConfigInputSimplifiedInput;
            }
            case 6: {
                final onj onj = (onj)o;
                Objects.requireNonNull(JsonOpenbackBatteryChargingStatus.Companion);
                e0e.f((Object)onj, "chargingStatusSignal");
                final JsonOpenbackBatteryChargingStatus jsonOpenbackBatteryChargingStatus = new JsonOpenbackBatteryChargingStatus();
                jsonOpenbackBatteryChargingStatus.a = onj.a;
                return jsonOpenbackBatteryChargingStatus;
            }
            case 5: {
                final sah sah = (sah)o;
                Objects.requireNonNull(JsonMetricsDataWrapperList.Companion);
                e0e.f((Object)sah, "metricsDataWrapperList");
                final JsonMetricsDataWrapperList list = new JsonMetricsDataWrapperList();
                list.t(sah.a);
                return list;
            }
            case 4: {
                final ht4 ht4 = (ht4)o;
                Objects.requireNonNull(JsonCommerceConfigRequestInput.Companion);
                e0e.f((Object)ht4, "commerceConfigRequestInput");
                final JsonCommerceConfigRequestInput jsonCommerceConfigRequestInput = new JsonCommerceConfigRequestInput();
                jsonCommerceConfigRequestInput.b = ht4.a;
                return jsonCommerceConfigRequestInput;
            }
            case 3: {
                return new veq((View)o);
            }
            case 2: {
                e0e.f((Object)o, "it");
                return new fg4();
            }
            case 1: {
                final Context context = (Context)o;
                e0e.f((Object)context, "context");
                final View inflate = LayoutInflater.from(context).inflate(2131624752, (ViewGroup)null, false);
                e0e.d((Object)inflate, "null cannot be cast to non-null type android.view.ViewGroup");
                return inflate;
            }
            case 0: {
                final Context context2 = (Context)o;
                e0e.f((Object)context2, "context");
                final View inflate2 = LayoutInflater.from(context2).inflate(2131624737, (ViewGroup)null, false);
                e0e.d((Object)inflate2, "null cannot be cast to non-null type android.view.ViewGroup");
                return inflate2;
            }
        }
    }
}
