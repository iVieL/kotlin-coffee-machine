class PlayingField {

    companion object Size {
        var width: Int = 0
            private set
        var height: Int = 0
            private set

        fun changeSize(width1: Int, height1: Int) {
            width = if(width1 < 0) 0 else width1
            height = if(height1 < 0) 0 else height1
        }
    }
}
