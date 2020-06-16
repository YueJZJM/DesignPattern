package builder.new1.stone;

import builder.new1.base.HouseBuilder;

public class HouseDirector {
    HouseBuilder mHouseBuilder;

    HouseDirector(HouseBuilder builder) {
        this.mHouseBuilder = builder;
    }

    public void bulider() {
        mHouseBuilder.step1();
        if (mHouseBuilder.step2()) {
            mHouseBuilder.step3();
        }
        mHouseBuilder.step4();
    }
}
