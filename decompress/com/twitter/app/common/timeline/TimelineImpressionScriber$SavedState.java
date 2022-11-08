// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.common.timeline;

import java.io.IOException;
import android.os.Parcel;
import android.os.Parcelable$Creator;

@lpe
public class TimelineImpressionScriber$SavedState<OBJ extends TimelineImpressionScriber> extends dq1<OBJ>
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
    
    public OBJ deserializeValue(final elp elp, final OBJ obj) throws IOException, ClassNotFoundException {
        final TimelineImpressionScriber timelineImpressionScriber = (TimelineImpressionScriber)super.deserializeValue(elp, (Object)obj);
        timelineImpressionScriber.e = elp.u();
        return (OBJ)timelineImpressionScriber;
    }
    
    public void serializeValue(final flp flp, final OBJ obj) throws IOException {
        super.serializeValue(flp, (Object)obj);
        flp.t(obj.e);
    }
}
