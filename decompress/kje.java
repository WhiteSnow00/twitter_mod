import com.twitter.util.InvalidDataException;
import java.util.Objects;
import com.twitter.model.json.timeline.urt.JsonTimelineEntry;
import java.util.Map;
import com.twitter.model.json.timeline.urt.JsonTimelineModuleItem;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kje implements kub<JsonTimelineModuleItem, wws>
{
    public String a;
    public final /* synthetic */ Map b;
    public final /* synthetic */ JsonTimelineEntry c;
    
    public kje(final JsonTimelineEntry c, final Map b) {
        this.c = c;
        this.b = b;
        this.a = null;
    }
    
    public final Object apply(final Object o) {
        final JsonTimelineModuleItem jsonTimelineModuleItem = (JsonTimelineModuleItem)o;
        vlh d;
        final vlh vlh = d = jsonTimelineModuleItem.d;
        if (vlh != null) {
            final boolean b = false;
            String s = vlh.a;
            final String a = this.a;
            boolean c = b;
            Label_0153: {
                if (a != null) {
                    Label_0125: {
                        if (!vlh.b) {
                            c = b;
                            if (!a.equals(s)) {
                                while (true) {
                                    Objects.requireNonNull(s);
                                    c = b;
                                    if (s.equals(this.a)) {
                                        break Label_0153;
                                    }
                                    c = b;
                                    if (!this.b.containsKey(s)) {
                                        break Label_0153;
                                    }
                                    final vlh vlh2 = this.b.get(s);
                                    Objects.requireNonNull(vlh2);
                                    if (vlh2.b) {
                                        break Label_0125;
                                    }
                                    if (!vlh2.a()) {
                                        break;
                                    }
                                    s = vlh2.a;
                                }
                                c = b;
                            }
                            break Label_0153;
                        }
                    }
                    c = true;
                }
            }
            if (pjr.e((CharSequence)vlh.a) && !vlh.b) {
                this.a = jsonTimelineModuleItem.a;
                this.b.clear();
            }
            String e;
            final String s2 = e = vlh.e;
            if (pjr.g((CharSequence)vlh.a)) {
                e = s2;
                if (pjr.e((CharSequence)s2)) {
                    e = s2;
                    if (this.b.containsKey(vlh.a)) {
                        final vlh vlh3 = this.b.get(vlh.a);
                        Objects.requireNonNull(vlh3);
                        e = vlh3.e;
                    }
                }
            }
            final vlh$a vlh$a = new vlh$a();
            vlh$a.a = vlh.a;
            vlh$a.b = vlh.b;
            vlh$a.c = c;
            vlh$a.e = e;
            d = (vlh)((h4j)vlh$a).e();
            this.b.put(jsonTimelineModuleItem.a, d);
        }
        wws t = this.c.t(jsonTimelineModuleItem.b, jsonTimelineModuleItem.a, jsonTimelineModuleItem.c, d);
        if (t == null) {
            final StringBuilder g = w48.g("An item entry with entry id ");
            g.append(jsonTimelineModuleItem.a);
            g.append(" in module with entry id");
            e9a.d((Throwable)new InvalidDataException(hi.I(g, this.a, " is null after parsing")));
        }
        else {
            final boolean b2 = t instanceof wws$a;
            final StringBuilder g2 = w48.g("Items within a module must subclass TimelineItemEntry.ModuleItem. Invalid itemEntry=");
            g2.append(t.getClass().getName());
            final String string = g2.toString();
            final ThreadLocal a2 = ij1.a;
            if (!b2) {
                ij1.h(string);
            }
            if (b2) {
                return t;
            }
        }
        t = null;
        return t;
    }
}
