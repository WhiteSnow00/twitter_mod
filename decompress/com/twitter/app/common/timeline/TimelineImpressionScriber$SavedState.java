// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.common.timeline;

import java.io.IOException;
import android.os.Parcel;
import android.os.Parcelable$Creator;

@xoe
public class TimelineImpressionScriber$SavedState<OBJ extends TimelineImpressionScriber> extends zp1<OBJ>
{
    public static final Parcelable$Creator CREATOR;
    
    static {
        CREATOR = (Parcelable$Creator)new TimelineImpressionScriber$SavedState$a();
    }
    
    public TimelineImpressionScriber$SavedState(final Parcel parcel) {
        super(parcel);
    }
    
    public TimelineImpressionScriber$SavedState(final OBJ obj) {
        super((Object)obj);
    }
    
    public OBJ deserializeValue(final vlp vlp, final OBJ obj) throws IOException, ClassNotFoundException {
        final TimelineImpressionScriber timelineImpressionScriber = (TimelineImpressionScriber)super.deserializeValue(vlp, (Object)obj);
        timelineImpressionScriber.e = vlp.s();
        return (OBJ)timelineImpressionScriber;
    }
    
    public /* bridge */ Object deserializeValue(final vlp vlp, final Object o) throws IOException, ClassNotFoundException {
        return this.deserializeValue(vlp, (TimelineImpressionScriber)o);
    }
    
    public void serializeValue(final wlp wlp, final OBJ obj) throws IOException {
        super.serializeValue(wlp, (Object)obj);
        wlp.r(obj.e);
    }
    
    public /* bridge */ void serializeValue(final wlp wlp, final Object o) throws IOException {
        this.serializeValue(wlp, (TimelineImpressionScriber)o);
    }
}
