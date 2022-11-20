// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.moduleconfiguration.businessinfo.hours.list;

import java.util.Iterator;
import java.util.Comparator;
import com.twitter.profilemodules.model.business.Weekday;
import java.util.Collection;
import com.twitter.business.model.hours.OpenHoursInterval;
import com.twitter.business.model.hours.DayAndOpenHours;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import com.twitter.business.api.BusinessHoursContentViewArgs;
import android.content.Context;
import java.util.List;
import com.twitter.business.model.hours.BusinessHoursData;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002" }, d2 = { "Lcom/twitter/business/moduleconfiguration/businessinfo/hours/list/BusinessHoursListItemProvider;", "", "feature.tfa.business.module-configuration.business-info_release" }, k = 1, mv = { 1, 7, 1 })
@v81
public final class BusinessHoursListItemProvider
{
    public final qv2 a;
    public final hv2 b;
    public BusinessHoursData c;
    public wv2 d;
    public final h5j<List<pv2>> e;
    
    public BusinessHoursListItemProvider(final Context context, final qv2 a, final zu2 zu2, final BusinessHoursContentViewArgs businessHoursContentViewArgs, final hv2 b, final jto jto) {
        czd.f((Object)context, "context");
        czd.f((Object)a, "hoursListItemFormatter");
        czd.f((Object)zu2, "businessHoursActionDispatcher");
        czd.f((Object)businessHoursContentViewArgs, "contentViewArgs");
        czd.f((Object)jto, "savedStateHandler");
        this.a = a;
        this.b = b;
        this.c = businessHoursContentViewArgs.getBusinessHoursData();
        jto.b((Object)this);
        final BusinessHoursData c = this.c;
        czd.f((Object)c, "<this>");
        final bw2 hoursType = c.getHoursType();
        final List dailyBusinessHours = c.getDailyBusinessHours();
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        final ArrayList list = new ArrayList<dv2>(iq4.H((Iterable)dailyBusinessHours, 10));
        for (final DayAndOpenHours dayAndOpenHours : dailyBusinessHours) {
            final Weekday day = dayAndOpenHours.getDay();
            final List intervals = dayAndOpenHours.getIntervals();
            final ArrayList list2 = new ArrayList<lv2>(iq4.H((Iterable)intervals, 10));
            for (final OpenHoursInterval openHoursInterval : intervals) {
                list2.add(new lv2(openHoursInterval.getStart(), openHoursInterval.getEnd()));
            }
            list.add(new dv2(day, mq4.P0((Collection)list2)));
        }
        for (final dv2 dv2 : list) {
            linkedHashMap.put(dv2.a, dv2);
        }
        final Weekday[] values = Weekday.values();
        for (int i = 0; i < values.length; ++i) {
            final Weekday weekday = values[i];
            if (!linkedHashMap.containsKey(weekday)) {
                linkedHashMap.put(weekday, new dv2(weekday));
            }
        }
        this.d = new wv2(hoursType, new cv2(mq4.F0((Iterable)mq4.M0((Iterable)linkedHashMap.values()), (Comparator)new xv2())), c.getTimezone());
        final h5j map = zu2.a().map((psb)new di((qsb)new BusinessHoursListItemProvider$a((Object)this), 16)).startWith((Object)this.d).map((psb)new lka((qsb)new BusinessHoursListItemProvider$b(this), 19));
        czd.e((Object)map, "businessHoursActionDispa\u2026stItems(it)\n            }");
        this.e = (h5j<List<pv2>>)map;
    }
    
    public final BusinessHoursData a() {
        return this.d.b();
    }
}
