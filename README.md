# ADNEOM Array chunk
> This code is my response to a test made by ADNEOM
> The test is about splitting an array into chunks

# ArrayHelpers
Class gathering multiple array helpers functions which are useful to all programmers.
simple and easy to use, the class contains only static methods.

The library contains the following functions : 

## ArrayChunk
The function chunks an array into arrays with size elements. The last chunk may contain less than size elements. 

#### Usage
```
arrayChunk(int[] input, int size, {boolean isDebugMode})
```

The function accepts 3 parameters : 

1. `input` (int[]) The input array to work on 
2. `sizesize` (int) The size of each chunk 
3. `isDebugModeisDebugMode` {optional} (Boolean) display log messages for debugging

The function returns a multidimensional array of chunks or ` null`

__Example__

```
int[] input = { 200, 5, 70, 11, 13, 99 }; 
int[][] output = ArrayHelpers.arrayChunk(input, 2); // to split by pair
System.out.println("output : " + Arrays.deepToString(output));

```

The output should be like this

```
[
	[200, 5],
	[70, 11],
	[13, 99]
]
```


In order to debug in the console, you should set the parameter `isDebugModeisDebugMode` as `true` 


## License
MIT © Aymene Bourafai

### Find me on
- Twitter [@bourafai](https://twitter.com/bourafai),
- LinkedIn [/in/bourafai](https://www.linkedin.com/in/bourafai/)
- Github [@bourafai](https://github.com/bourafai),
