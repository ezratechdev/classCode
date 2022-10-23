function merge( left , right ){
    let sorted = [];
    while(left.length && right.length){
        if(left[0] < right[0]){
            sorted.push(left.shift());
        } else{
            sorted.push(right.shift())
        }
    }
    return [ ...sorted , ...left , ...right];
}

function merge_sort( array ){
    if(array.length == 1) return array;
    let 
    mid_index = Math.floor(array.length / 2),
    left = merge_sort(array.slice(0 , mid_index));
    right = merge_sort(array.slice(mid_index));
    return merge(left , right);
}

console.log(merge_sort([ 12 , 140 , 115 , 11 , 19 , 21 ]))
