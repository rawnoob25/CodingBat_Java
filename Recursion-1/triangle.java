public int triangle(int rows) {
  if (rows<2)
    return rows;
  return rows+triangle(rows -1 );
}
